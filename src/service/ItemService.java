package service;

import model.Item;
import model.ItemType;

import java.util.*;

public class ItemService<T extends Item> {
    private List<T> itemsList = new ArrayList<>();

    public void addItem(T item){
        itemsList.add(item);
    }

    public List<T> filterByPrice () {
        List<T> sortedList = new ArrayList<>(itemsList);
        sortedList.sort(Comparator.comparingDouble(Item::getPrice));
        return sortedList;
    }

    public Optional<T> findMinWeightItem() {
        if (itemsList.isEmpty()){
            return Optional.empty();
        }
        return itemsList.stream()
                .min(Comparator.comparingDouble(Item::getWeight));
    }

    public Set<ItemType> typesItems() {
        Set<ItemType> typesSet = new HashSet<>();
        if (itemsList == null) {
            return typesSet;
        }
        for (T item: itemsList){
            typesSet.add(item.getItemType());
        }
        return typesSet;
    }
}
