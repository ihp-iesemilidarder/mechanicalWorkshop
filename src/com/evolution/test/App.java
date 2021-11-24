package com.evolution.test;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import com.evolution.Worker;
import com.evolution.Client;
import com.evolution.Fault;
import com.evolution.types.FaultType;
import com.evolution.types.WorkerCategory;
import com.evolution.Invoice;
import com.evolution.Vehicle;
import com.evolution.WebUser;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Worker
			List<String> surnames1 = new ArrayList<String>();
			surnames1.add("León");
			surnames1.add("Guerrero");
			Worker worker = new Worker(1,"12345678A","Jhilmar",
					surnames1,"jhilmar@gmail.com","1234567890",
					1,10000,WorkerCategory.MESTRE);
	
		// WebUser
			List<String> surnames2 = new ArrayList<String>();
			surnames2.add("Sebas");
			surnames2.add("");
			WebUser webUser = new WebUser(1,"12345678A","Jhon",
					surnames2,"jhon@gmail.com","1234567890",
					1,true,1,"jhonSebas","12345");
			
		// Vehicle
			Vehicle vehicle = new Vehicle(1,"ABC-453","45B",LocalDate.now(),webUser);

		// Faults
			Fault fault1 = new Fault(1,"Tanque de gasolina","Pierde gasolina.",100,FaultType.GREU,worker,vehicle);
			Fault fault2 = new Fault(2,"Titulo2","Descripcion2",100,FaultType.LLEUGERA,worker,vehicle);
			Fault fault3 = new Fault(3,"Titulo3","Descripcion3",100,FaultType.MITJANA,worker,vehicle);
			Fault fault4 = new Fault(4,"Titulo4","Descripcion4",100,FaultType.LLEUGERA,worker,vehicle);
			
		// Invoice
			List<Fault> faults = new ArrayList<Fault>();
			
			faults.add(fault1);
			faults.add(fault2);
			faults.add(fault3);
			faults.add(fault4);
			
			Invoice invoice = new Invoice(1,faults,true,LocalDate.now());
			
		// Faults2
			Fault fault5 = new Fault(5,"Tanque de gasolina","Pierde gasolina.",100,FaultType.GREU,worker,vehicle);
			Fault fault6 = new Fault(6,"Titulo2","Descripcion2",450,FaultType.LLEUGERA,worker,vehicle);
			Fault fault7 = new Fault(7,"Titulo3","Descripcion3",200,FaultType.MITJANA,worker,vehicle);
			Fault fault8 = new Fault(8,"Titulo4","Descripcion4",150,FaultType.LLEUGERA,worker,vehicle);
			
		// Invoice2
			List<Fault> faults2 = new ArrayList<Fault>();
			
			faults2.add(fault5);
			faults2.add(fault6);
			faults2.add(fault7);
			faults2.add(fault8);
			
			Invoice invoice2 = new Invoice(2,faults2,true,LocalDate.now());
		
		
		///
		
		for(Fault fault: invoice.getFaultsList()) {
			System.out.println(fault);
		}
		
		///
		
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoices.add(invoice2);
		invoices.add(invoice);
		for(Invoice invoiceItem: invoices) {
			System.out.println(invoiceItem.toString());
			double total = 0;
			for(Fault faultItem: invoiceItem.getFaultsList()) {
				System.out.println("\t"+faultItem);
			}
			System.out.println("Total: "+invoiceItem.totalPrice()+"\n");
		}
		
		///
		
		System.out.println(webUser.toString());
	}

}