package tests.quizzes;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppingList;
	
	public static void main(String[] args) {
		String[] justDescriptions = getDescriptions();
		initLists(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void initLists(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();
		for(String s: justDescriptions){
			shoppingList.add(new Item(s));
		}
		
//		for(int i = 0;i < justDescriptions.length;i++){
//			shoppingList.add(new Item(justDescriptions[i]));
//		}
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
		
	}

	private static String[] getDescriptions() {
		String[] test = {"a life", "potatoes", "chips", "tomatoes"};
		return test;
	}
	
	private static void printPurchasedItems() {
		for(int i = 0; i < shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println("Bought" + shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		}
		
	}


}
