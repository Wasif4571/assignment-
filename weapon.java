 public class weapon {
    private String name;
    private int damage; 
    private string element;
    
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
 
 public String GetInfo() { 
    return name + " (" + damage + " " element + "damage)";
