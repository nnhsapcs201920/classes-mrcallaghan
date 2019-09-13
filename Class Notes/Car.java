/**
 * Write a description of class Car here.
 * This class models a car that drives and consumes fuel.  It also has a license plate.
 *
 * @author mcallaghan
 * @version 9 Sept 2019
 */
public class Car  // public means others can see and use it
{
    /*
     * INSTANCE VARIABLES store the object's ATTRIBUTES (sometime called 'properties', 'state', or 'data')
     *      specify the visibility (e.g. private)
     *          public: accessible by anyone
     *          private: only accessed through methods in the class
     *      specify the type (e.g. double)
     *      specify the name (e.g. fuelEfficiency)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to their class (accessible using the methods of the class)
     *      automatically initialized to a default value (0, false, null)
     */
    private double fuelEfficiency;  // in units of miles per gallon
    private double fuelInTank;  // in units of gallons
    private String licensePlate;
    
    /*
     * CONSTRUCTOR:
     *      -responsible for initializing newly created objects
     *      -invoked automatically via the new operator
     *      -the name of the constructor must match the name of the class
     *      -has no return type (not even void)
     *      -multiple constructors may be defined for a class
     *      -one constructor may call another constructor (with restrictions)
     *      -added after instance variables (by convention only)
     */
    
    /**
     * Default constructor for the Car class.
     *      Initializes the fuel efficiency to 30 mpg and the fuel in tank to 0 gallons.
     */
    public Car()
    {
        /*
         * The 'this' reserved word references the current object (like 'self' in Python)
         * It's usage is encouraged but usually not required.  
         */
        this.fuelEfficiency = 30.0;
        this.fuelInTank = 0;
        this.licensePlate = "";
        
    }
    
    /**
     * Constructs a new Car object with a specified fuel efficiency
     * 
     * @param intialEfficiency the initial fuel efficiency in mpg, of this new car
     */
    public Car( double initialEfficiency )
    {
        
        /*
         * If the parameter was named fuelEfficiency, it would "shadow" the instance 
         *      variable fuelEfficiency.
         * Local and parameter variable "shadow" instance variables of the same name.  In this code
         *      fuelEfficiency would refer to the parameter and not the instance variable.
         *      
         * To refer explicitly to the instance variable, use "this".
         * Adivce: avoid the shadow issue by giving parameters unique names.
         */
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
        this.licensePlate = "";
    }
    
    /*
     * When defining a method, specify:
     *      the visibility (e.g. public)
     *      the return type (e.g. void)
     *      the method name (e.g. drive)
     *      the parameters and their types (e.g. distance of type double)
     */
    
    /**
     * Drives the car the specified disance, in miles, consuming fuel
     * 
     * @param distance the distance, in miles, the car drives
     */
    public void drive( double distance )
    {
        this.fuelInTank -= ( this.fuelEfficiency / distance );
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to the car's tank
     */
    public void addFuel( double amount )
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in gallons, in this car's tank
     */
    public double getFuelInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Sets the license plate to the specified value
     * 
     * @param plate the license plate for this car
     */
    public void setLicensePlate( String plate )
    {
        this.licensePlate = plate;
    }
    
    /**
     * Gets the license plate of the car
     * 
     * @return the license plate for this car
     */
    public String getLicensePlate( )
    {
        return this.licensePlate;
    }
    
}
