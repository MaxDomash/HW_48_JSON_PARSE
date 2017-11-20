package core;

import java.util.logging.*;

public class Main {

	String ip_Euro = "88.191.179.56";
	String ip_Yuan = "61.135.248.220";
	String ip_Pound = "92.40.254.196";
	String ip_Hryvnia = "93.183.203.67";
	String ip_Ruble = "213.87.141.36";

	static String us_currency_symbol = "$";
	static String product_title;
	static String original_price = "0.0";
	static String country_name;
	static String currency_symbol;
	static String eur_price;

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(""); logger.setLevel(Level.OFF);

		////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////
		
		System.out.println("Item: " + product_title + "; "
		+  "US Price: " + us_currency_symbol + original_price + "; "
		+ "for country: " + country_name + "; "
		+ "Local Price: " + currency_symbol + eur_price);
	}
}
