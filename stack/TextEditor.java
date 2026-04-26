package stack;

import java.util.Stack;

public class TextEditor {
    private String currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        currentText = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void addText(String text) {
        undoStack.push(currentText);
        currentText += text;
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Tidak ada aksi untuk undo");
            return;
        }

        redoStack.push(currentText);
        currentText = undoStack.pop();
        System.out.println("Undo: \"" + currentText + "\"");
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Tidak ada aksi untuk redo");
            return;
        }

        undoStack.push(currentText);
        currentText = redoStack.pop();
        System.out.println("Redo: \"" + currentText + "\"");
    }

    public void showText() {
        System.out.println("Teks saat ini: \"" + currentText + "\"");
    }
}