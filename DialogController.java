package com.masterjava.todolist;

import datamodel.TodoData;
import datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    @FXML
    public void processResult(){
        String shortDescriptionField = shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoData.getInstance().addTodoItem(new TodoItem(shortDescriptionField,details,deadlineValue));
    }

}
