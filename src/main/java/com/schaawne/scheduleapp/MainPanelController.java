package com.schaawne.scheduleapp;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import org.controlsfx.control.spreadsheet.*;

import java.util.ArrayList;

/**
 * MainPanelController class for ScheduleApp
 * <p>
 * Controller class for MainPanel.fxml
 * </p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class MainPanelController
{
    @FXML private BorderPane m_basePane;

    enum SpanEnum
    {
        NORML,
        HSPAN,
        VSPAN,
        SKIPP
    };

    /**
     * Called immediately after loading MainPanel.fxml
     */
    @FXML
    public void initialize()
    {
        int rowCount = 22;
        int columnCount = 7;
        GridBase grid = new GridBase(rowCount, columnCount);
        SpanEnum[][] spanSettings = {
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP},
                {SpanEnum.VSPAN, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.VSPAN, SpanEnum.NORML},
                {SpanEnum.SKIPP, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.SKIPP, SpanEnum.NORML},
                {SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP, SpanEnum.NORML, SpanEnum.NORML, SpanEnum.HSPAN, SpanEnum.SKIPP}
        };
        grid.getColumnHeaders().setAll("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        grid.getRowHeaders().setAll("09:00AM", "09:30AM", "10:00AM", "10:30AM", "11:00AM", "11:30AM",
                "12:00 PM", "12:30 PM", "01:00 PM", "01:30 PM", "02:00 PM", "02:30 PM",
                "03:00 PM", "03:30 PM", "04:00 PM", "04:30 PM", "05:00 PM", "05:30 PM",
                "06:00 PM", "06:30 PM", "07:00 PM", "07:30 PM");

        ArrayList<ObservableList<SpreadsheetCell>> rows = new ArrayList<>(grid.getRowCount());
        for (int row = 0; row < grid.getRowCount(); ++row) {
            final ObservableList<SpreadsheetCell> rowdata = FXCollections.observableArrayList();
            for (int column = 0; column < grid.getColumnCount(); ++column) {
                rowdata.add(SpreadsheetCellType.STRING.createCell(row, column, 1, 1, "EMPTY"));
            }
            rows.add(rowdata);
        }
        grid.setRows(rows);

        for (int row = 0; row < grid.getRowCount(); ++row)
        {
            for(int column = 0; column < grid.getColumnCount(); ++column)
            {
                switch (spanSettings[row][column])
                {
                    case NORML:
                        //skip
                        break;
                    case HSPAN:
                        grid.spanColumn(2, row, column);
                        break;
                    case VSPAN:
                        grid.spanRow(2, row, column);
                        break;
                    default:
                        //skip
                        break;
                }
            }
        }

        SpreadsheetView spv = new SpreadsheetView(grid);
        for(SpreadsheetColumn col : spv.getColumns())
        {
            col.setPrefWidth(75.0);
        }
        spv.setRowHeaderWidth(75.0);

        m_basePane.setCenter(spv);
    }

    public void FileMenu_Close_Clicked(ActionEvent actionEvent)
    {
        Platform.exit();
    }

    public void HelpMenu_About_Clicked(ActionEvent actionEvent)
    {
        
    }
}
