package com.example.packyourbag.Data;

import static com.example.packyourbag.Database.RoomDB.database;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.packyourbag.Constants.MyConstants;
import com.example.packyourbag.Database.RoomDB;
import com.example.packyourbag.Models.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {
    RoomDB databse;
    String category;
    Context context;


    public static final String LAST_VERSION = "LAST_VERSION";
    public static final int NEW_VERSION = 1;

    public AppData(RoomDB databse){ this.databse = database;}

    public AppData(RoomDB databse , Context context) {
        this.databse = databse;
        this.context = context;

    }

    public List <Items> getBasicData(){
        category = "Basic Needs";
        List<Items> basicItem = new ArrayList<>();
        basicItem.clear();
        basicItem.add(new Items(false, "Visa", category));
        basicItem.add(new Items(false, "Passport", category));
        basicItem.add(new Items(false, "Tickets", category));
        basicItem.add(new Items(false, "Wallet", category));
        basicItem.add(new Items(false, "Driving License", category));
        basicItem.add(new Items(false, "Currency", category));
        basicItem.add(new Items(false, "House Key", category));
        basicItem.add(new Items(false, "Book", category));
        basicItem.add(new Items(false, "Travel Pillow", category));
        basicItem.add(new Items(false, "Eye Patch", category));
        basicItem.add(new Items(false, "Umbrella", category));
        basicItem.add(new Items(false, "Note Book", category));
        return basicItem;
    }
    public List<Items> getPersonalCareData() {
        String[] data = {
                "Toothbrush", "Toothpaste", "Floss", "Mouthwash", "Shaving Cream",
                "Soap", "Fiber", "Shampoo", "Hair Conditioner", "Brush", "Comb",
                "Hair Dryer", "Curling Iron", "Hair Moulder", "Hair Clip", "Moisturizer",
                "Lip Cream", "Contact Lens", "Perfume", "Makeup Materials",
                "Makeup Remover", "Ear Stick", "Cotton", "Nail Polish Remover",
                "Tweezers", "Nail Scissors", "Nail Files", "Suntan Cream"
        };
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE, data);
    }

    public List<Items> getClothingData() {
        String[] data = {
                "Stockings", "Underwear", "Pajamas", "T-Shirts", "Casual Dress",
                "Evening Dress", "Shirt", "Cardigan", "Vest", "Jacket", "Skirt",
                "Trousers", "Jeans", "Shorts", "Coat", "Heeled Shoes", "Sneakers",
                "Sandals", "Slippers", "Sports Wear"
        };
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE, data);
    }

    public List<Items> getBabyNeedsData() {
        String[] data = {
                "Snapsuit", "Outfit", "Jumpsuit", "Baby Socks", "Baby Hat", "Baby Pyjamas",
                "Baby Bath Towel", "Muslin", "Blanket", "Dribble Bibs", "Baby Laundry Detergent",
                "Baby Bottles", "Baby Food Thermos", "Baby Bottle Brushes", "Breast-feeding Cover",
                "Breast Pump", "Water Bottle", "Storage Container", "Baby Food Spoon",
                "Wet Wipes", "Baby Cotton", "Baby Care Cover", "Baby Shampoo", "Baby Soap", "Baby Nail Scissors"
        };
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE, data);
    }
    public List<Items> getHealthData() {
        String[] data = {
                "Hot Water Bag",
                "Bandages",
                "Pain Relievers",
                "First Aid Kit",
                "Eye Drops",
                "Vitamins",
                "Cough Syrup",
                "Antiseptic Solution",
                "Thermometer"
        };
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE, data);
    }

    public List<Items> getTechGadgetsData() {
        String[] data = {
                "Mobile Phone",
                "Phone Cover",
                "E-Book Reader",
                "Camera",
                "Camera Charger",
                "Portable Speaker",
                "iPad",
                "Tablet",
                "Headphones",
                "Laptop Charger",
                "USB Cable",
                "Data Transfer Cable",
                "Power Bank",
                "DVD Player",
                "Flashlight",
                "MP3 Player",
                "Memory Card"
        };
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE, data);
    }

    public List<Items> getFoodData() {
        String[] data = {
                "Snacks",
                "Juice",
                "Tea Bags",
                "Coffee",
                "Water Bottle",
                "Thermos",
                "Chocolates",
                "Baby Food"
        };
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE, data);
    }
    public List<Items> getBeachSuppliesData() {
        String [] data = {"Sea Glasses", "Sea Bed", "Suntan Cream", "Beach Umbrella", "Swim Fins",
                "Beach Bag", "Beach Towel", "Beach Slippers",
                "Sunbed", "Snorkel", "Waterproof Clock"};
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getCarSuppliesData() {
        String [] data = {"Pump", "Car Jack", "Spare Car Key", "Accident Record Set", "Auto Refrigerator",
                "Car Cover", "Car Charger", "Window Sun Shades"};
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getNeedsData() {
        String [] data = {"Backpack", "Daily Bags", "Laundry Bag", "Sewing Kit",
                "Travel Lock", "Luggage Tag", "Magazine",
                "Sports Equipment", "Important Numbers"};
        return prepareItemsList(MyConstants.NEEDS_CAMEL_CASE, data);
    }

    public List<Items> prepareItemsList (String category , String[] data){
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for(int i =0; i<list.size();i++){
            dataList.add(new Items(false,list.get(i),category));
        }
        return dataList;
    }
    public List<List<Items>> getAllData(){
        List<List<Items>> listOfAllItems = new ArrayList<>();
        listOfAllItems.clear();
        listOfAllItems.add(getBasicData());
        listOfAllItems.add(getClothingData());
        listOfAllItems.add(getPersonalCareData());
        listOfAllItems.add(getBabyNeedsData());
        listOfAllItems.add(getHealthData());
        listOfAllItems.add(getTechGadgetsData());
        listOfAllItems.add(getFoodData());
        listOfAllItems.add(getBeachSuppliesData());
        listOfAllItems.add(getCarSuppliesData());
        listOfAllItems.add(getNeedsData());
        return listOfAllItems;
    }
    public void persistAllData(){
        List<List<Items>> listOfAllItems = getAllData();
        for(List<Items> list: listOfAllItems){
            for(Items items : list){
                database.mainDao().saveItem(items);
            }
        }
        System.out.print("Data Added.");
    }

    public void persistDataByCategory(String category , Boolean onlyDelete){
        try{
            List<Items> list = deleteAndGetListByCategory(category , onlyDelete);
            if(!onlyDelete){
                for(Items items:list){
                    database.mainDao().saveItem(items);
                }
                Toast.makeText(context, "Reset Successfully", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(context, "Reset Successfully", Toast.LENGTH_SHORT).show();
            }

        }catch(Exception ex){
            ex.printStackTrace();
            Toast.makeText(context,"Something went wrong", Toast.LENGTH_SHORT).show();
        }
    }


    private List<Items> deleteAndGetListByCategory(String category , Boolean onlyDelete){
        if(onlyDelete){
            database.mainDao().deleteAllByCategoryAddedBy(category,MyConstants.SYSTEM_SMALL);

        }else{
            database.mainDao().deleteAllByCategory(category);
        }

        switch (category){
            case MyConstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();

            case MyConstants.CLOTHING_CAMEL_CASE:
                return getClothingData();

            case MyConstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalCareData();

            case MyConstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedsData();

            case MyConstants.HEALTH_CAMEL_CASE:
                return getHealthData();

            case MyConstants.TECHNOLOGY_CAMEL_CASE:
                return getTechGadgetsData();

            case MyConstants.FOOD_CAMEL_CASE:
                return getFoodData();

            case MyConstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();

            case MyConstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();

            case MyConstants.NEEDS_CAMEL_CASE:
                return getNeedsData();

            default:
                return new ArrayList<>();
        }
    }
}
