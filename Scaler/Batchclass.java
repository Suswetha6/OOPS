
package Scaler;
import java.util.*;
import java.time.LocalDate;
public class Batchclass {
  protected String BatchName;
  public LocalDate StartDate;
  //listOfStudents
  public Instructorclass Instructor;
  protected List<studentclass> students;
  public Batchclass(){
    this.StartDate =LocalDate.of(2024,2,12);
  }
}
