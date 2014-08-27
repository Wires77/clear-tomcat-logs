/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clearwateranalytics.clearlogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
		category = "Tomcat",
		id = "com.clearwateranalytics.clearlogs.ClearTomcatLogs"
)
@ActionRegistration(
		displayName = "#CTL_ClearTomcatLogs"
)
@ActionReference(path = "Menu/Tools", position = 805)
@Messages("CTL_ClearTomcatLogs=Clear Logs")
public final class ClearTomcatLogs implements ActionListener
{
	@Override public void actionPerformed(ActionEvent e)
	{
		File dir = new File("C:\\Program Files\\Apache Software Foundation\\apache-tomcat-7.0.55\\logs");
		for (File f : dir.listFiles())
		{
			f.delete();
		}
	}
}
