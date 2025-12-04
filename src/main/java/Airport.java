
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airport")
    
public class Airport {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String name;
 private String city;
 private String country;

 @Column(name = "iatacode")
 private String iataCode;

 @Column(name = "icaocode")
 private String icaoCode;

 private double latitude;
 private double longitude;
 private double altitude;

 @Column(name = "offsetutc")
 private double offsetFromUTC;

 @Column(name = "dstcode")
 private String dstCode;
 private String timezone;

    long getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getIataCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
