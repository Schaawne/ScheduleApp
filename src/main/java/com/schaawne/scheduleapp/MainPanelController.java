package com.schaawne.scheduleapp;

import javafx.application.Platform;
import javafx.event.ActionEvent;

/**
 * MainPanelController class for ScheduleApp
 * <p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MainPanelController
{

    public void FileMenu_Close_Clicked(ActionEvent actionEvent)
    {
        Platform.exit();
    }

    public void HelpMenu_About_Clicked(ActionEvent actionEvent)
    {
        
    }
}
