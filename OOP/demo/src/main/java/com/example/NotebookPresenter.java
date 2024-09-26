package com.example;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
public class NotebookPresenter {
private Notebook model;
private NotebookView view;
public NotebookPresenter(Notebook model, NotebookView view) {
this.model = model;
this.view = view;
}
public void addNote() {
LocalDateTime dateTime = view.getDateTimeInput();
String description = view.getDescriptionInput();
model.add(new Note(dateTime, description));
view.showMessage("Note added.");
}
public void showNotesForDay() {
LocalDateTime dateTime = view.getDateTimeInput();
List<Note> notes = model.getNotesForDay(dateTime);
view.showNotes(notes);
}
public void showNotesForWeek() {
LocalDateTime startOfWeek = view.getDateTimeInput();
List<Note> notes = model.getNotesForWeek(startOfWeek);
view.showNotes(notes);
}
public void saveNotes() {
String fileName = view.getFileNameInput();
try {
model.saveToFile(fileName);
view.showMessage("Notes saved to " + fileName);
} catch (IOException e) {
view.showMessage("Failed to save notes: " +
e.getMessage());
}
}
public void loadNotes() {
String fileName = view.getFileNameInput();
try {
model.loadFromFile(fileName);
view.showMessage("Notes loaded from " + fileName);
} catch (IOException e) {
    view.showMessage("Failed to load notes: " +
e.getMessage());
}
}
}