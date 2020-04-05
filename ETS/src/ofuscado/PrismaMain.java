package ofuscado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrismaMain {
	static Scanner keyb = new Scanner(System.in);

	public static void main(String[] args) {
		double baseTriangulo = 0;
		double alturaPrisma = 0;
		ArrayList<PrismaObj> listaprisma = new ArrayList<>();
		ArrayList<Double> numAreas = new ArrayList<>();

		System.out.println("¿Cuántos prismas quiere calcular?");
		int num = keyb.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Introduzca los datos del " + (i+1) + "º prisma");
			System.out.println("Base del triángulo: ");
			baseTriangulo = keyb.nextDouble();

			System.out.println("Altura del prisma: ");
			alturaPrisma = keyb.nextDouble();

			listas(baseTriangulo, alturaPrisma, listaprisma, numAreas);
		}

		ordenarAreas(numAreas);
System.out.println("--------------------------------");
		System.out.println("ESTOS SON LOS PRISMAS CREADOS");
		System.out.println("----------------------------");
		mostrarPrismas(listaprisma);

	}

	private static void ordenarAreas(ArrayList<Double> numAreas) {
		numAreas.sort(null);
		Collections.reverse(numAreas);
	}

	private static void listas(double baseTriangulo, double alturaPrisma, ArrayList<PrismaObj> listaprisma,
			ArrayList<Double> areas) {

		PrismaObj prisma = new PrismaObj(baseTriangulo, alturaPrisma);
		listaprisma.add(prisma);
		areas.add(prisma.areaTotal(baseTriangulo, alturaPrisma));
	}

	private static void mostrarPrismas(ArrayList<PrismaObj> listaprisma) {
		int i = 1;

		for (PrismaObj a : listaprisma) {

			System.out.println("Prisma: " + i);
			System.out.println("Base del prisma: " + a.getBaseTriangulo());
			System.out.println("Altura del prisma: " + a.getAlturaPrisma());
			System.out.println("Area del prisma: " + a.areaTotal(a.getBaseTriangulo(), a.getAlturaPrisma()));
			System.out.println("----------------------------------------------");
			i++;
		}

	}
}
