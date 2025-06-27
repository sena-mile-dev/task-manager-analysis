// In TaskService.java

public ByteArrayInputStream exportTasksToCSV() {
    List<Task> tasks = taskRepository.findAll();
    final CSVFormat format = CSVFormat.DEFAULT.withHeader("ID", "Title", "Description", "Due Date", "Status", "Priority");

    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
         CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format)) {

        for (Task task : tasks) {
            csvPrinter.printRecord(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getStatus(),
                task.getPriority()
            );
        }
        csvPrinter.flush();
        return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
        throw new RuntimeException("Failed to export tasks to CSV", e);
    }
}

// In TaskController.java

@GetMapping("/tasks/export")
public ResponseEntity<InputStreamResource> exportTasks() {
    ByteArrayInputStream csvData = taskService.exportTasksToCSV();

    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Disposition", "attachment; filename=tasks.csv");

    return ResponseEntity.ok()
        .headers(headers)
        .contentType(MediaType.parseMediaType("application/csv"))
        .body(new InputStreamResource(csvData));
}
