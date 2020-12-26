package com.module.one;

class Items {
	int item_id;
	String item_name;
	int item_qant;
	double item_cost;
}

class Basket {
	Customer cust;
	int counter = 0, max_items = 10;
	Items items[] = new Items[max_items];

	Basket(Customer cust) {
		this.cust = cust;
		System.out.println("Assigning a Basket to Customer " + cust.cust_name + "(" + cust.cust_id + ")...\n");
	}

	void addItemToBasket(int item_id, String item_name, int item_qant, double item_cost) {
		System.out.println("Adding item(" + item_id + ") to the "+cust.cust_name+"'s basket...");

		items[counter] = new Items();
		items[counter].item_id = item_id;
		items[counter].item_name = item_name;
		items[counter].item_qant = item_qant;
		items[counter].item_cost = item_cost;

		counter += 1;
	}

	void delItemFromBasket(int item_id) {
		int temp = counter - 1;

		do {
			if (items[temp].item_id == item_id) {
				System.out.println("\nRemoving item(" + item_id + ") from "+cust.cust_name+"'s basket...");
				items[temp].item_id = 0;
				return;
			}
			temp -= 1;
		} while (temp >= 0);

		System.out.println("\nSorry "+cust.cust_name+", item with id '" + item_id + "' doesn't exist!!");
	}

	void showItem() {
		System.out.println("\nCustomer :" + cust.cust_name + "(" + cust.cust_id + ")");
		System.out.println("Item_ID\t\tItem_Name\tItem_Quantity\tItem_Cost");

		for (int i = 0; i < counter; i += 1) {
			if (items[i].item_id != 0)
				System.out.println(items[i].item_id + "\t\t" + items[i].item_name + "\t\t" + items[i].item_qant + "\t\t"
						+ items[i].item_cost);
		}
		System.out.println();
	}
}

public class TestMain2 {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.createCust(11096, "Manthan", "Indore", "1234567890");
		Customer cust2 = new Customer();
		cust2.createCust(13004, "Tony", "NYC", "1987654321");

		Basket bskt = new Basket(cust1);
		Basket bskt_cust2 = new Basket(cust2);

		// Customer 1
		bskt.addItemToBasket(100, "Maggi", 4, 10);
		bskt.addItemToBasket(554, "Milk", 2, 55);
		bskt.addItemToBasket(110, "Rice", 1, 655);
		bskt.showItem();

		bskt.delItemFromBasket(100);
		bskt.showItem();


		// Customer 2
		bskt_cust2.addItemToBasket(500, "Bread", 4, 25);
		bskt_cust2.addItemToBasket(223, "Candy", 2, 10);
		bskt_cust2.addItemToBasket(178, "Pepsi", 2, 45);
		bskt_cust2.addItemToBasket(999, "Water", 1, 14);
		bskt_cust2.showItem();

		bskt_cust2.delItemFromBasket(100);
		bskt_cust2.showItem();
	}
}
