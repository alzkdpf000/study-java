package list.task;

import java.util.ArrayList;

import list.book.Book;
import list.car.Car;
import list.food.Food;
import list.fruit.Fruit;
import list.movie.Movie;
import list.task.product.Product;
import list.task.user.User;

public class DBConnecter {
   
   protected DBConnecter() {;}
   
   public static ArrayList<User> users = new ArrayList<User>();
   
   public static ArrayList<Fruit> fruits = new ArrayList<Fruit>(); 
   
   public static ArrayList<Food> foods = new ArrayList<Food>();

   public static ArrayList<Book> books = new ArrayList<Book>();
   public static ArrayList<Movie> movies = new ArrayList<Movie>();
   public static ArrayList<Car> cars = new ArrayList<Car>();
   public static ArrayList<Product> products = new ArrayList<Product>();
   
}
