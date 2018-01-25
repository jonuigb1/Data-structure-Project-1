package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Directory {

	private static ArrayList<String> list;

	private static void addFiles(File dir) {
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				list.add(file.getAbsolutePath());
				if (file.isDirectory()) {
					addFiles(file);
				}
			}
		}
	}

	public static void main(String[] args) {

		list = new ArrayList<String>();
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		chooser.setAcceptAllFileFilterUsed(false);
		int value = chooser.showOpenDialog(null);
		if (value != JFileChooser.APPROVE_OPTION) {
			return;
		}
		addFiles(chooser.getSelectedFile());
		for (String name : list) {
			System.out.println(name);
		}

	}
	
	 public void search(String name,File file)
	    {
	        File[] list = file.listFiles();
	        if(list!=null)
	        for (File files : list)
	        {
	            if (files.isDirectory())
	            {
	                search(name,files);
	            }
	            else if (name.equalsIgnoreCase(files.getName()))
	            {
	                System.out.println(files.getParentFile());
	            }
	        }
	    }
	    public static void mains(String[] args) {
	    	
	        Directory ff = new Directory();
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the file to be searched.. " );
	        String name = scan.next();
	        System.out.println("Enter the directory where to search ");
	        String directory = scan.next();
	        ff.search(name,new File(directory));
	    }

	
}
