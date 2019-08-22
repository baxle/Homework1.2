package CandyGift.Interface;


import CandyGift.Sweets.Sweet;

public interface CanDo {
     void add(Sweet sweet);
     void remove();
     void remove(int index);
     double getTotalWeight();
     int getTotalPrice();
     void getAllInfo();
     void reduceWeight(double weight);
     void reducePrice(int price);



}
