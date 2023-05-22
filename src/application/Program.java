package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> sales = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				
				int month = Integer.parseInt(fields[0]);
				int year = Integer.parseInt(fields[1]);
				int items = Integer.parseInt(fields[3]);
				double total = Double.parseDouble(fields[4]);

				sales.add(new Sale(month, year, fields[2], items, total));
				
				line = br.readLine();
			}

			Set<String> sellers = new HashSet<>();
			
			for(Sale s : sales) {
				sellers.add(s.getSeller());
			}
			
			System.out.println("Total de vendas por vendedor:");
			for(String seller : sellers) {
				double sum = 0;
				sum = sales.stream()
						   .filter(sale -> sale.getSeller()
						   .contains(seller))
						   .map(sale -> sale.getTotal())
						   .reduce(0.0, (x,y) -> x + y);
				 
				System.out.printf("%s - R$ %.2f%n", seller, sum);
			}
			
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
