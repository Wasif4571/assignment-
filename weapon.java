 public class Weapon {
    private String name;
    private int damage; 
    private String element;
    
    public Weapon(String name, int damage, String element) {
       this.name = name;
       this.damage = damage;
       this.element = element;
 } 
 
 public Weapon(String name, int damage) {
    this(name, damage, "Physical");
 }
 
 public Weapon() { 
    this("Rusty Dagger" , 5);
 } 
 
 public String getInfo() { 
    return name + " (" + damage + " " element + "DMG)";
  }
 }