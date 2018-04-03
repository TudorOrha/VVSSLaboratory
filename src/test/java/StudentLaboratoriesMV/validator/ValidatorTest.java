package StudentLaboratoriesMV.validator;

import StudentLaboratoriesMV.model.Student;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tudor on 4/3/2018.
 */
public class ValidatorTest {

    private Student Stud1, Stud2, Stud3, Stud4, Stud5, Stud6, Stud7, Stud8;

    @Before
    public void setUp() throws Exception {
        Stud1 = new Student("otie1972","Tudor Orha",1000);
        Stud2 = new Student("otie1972","Tudor Orha",935);
        Stud3 = new Student("otie1972","Tudor",935);
        Stud4 = new Student("otie1972","Tudor Razvan Orha",936);
        Stud5 = new Student("otrie1972","Tudor Orha",936);
        Stud6 = new Student("oti1972","Tudor Orha",936);
        Stud7 = new Student("otie192","Tudor Orha",936);
        Stud8 = new Student("otie19725","Tudor Orha",936);
    }

    @Test
    public void validateStudent() throws Exception {
        assertEquals(false, Validator.validateStudent(Stud1));
        assertEquals(true , Validator.validateStudent(Stud2));
        // TO DO: this should be false
        assertEquals(true , Validator.validateStudent(Stud3));
        assertEquals(false, Validator.validateStudent(Stud4));
        assertEquals(false, Validator.validateStudent(Stud5));
        assertEquals(false, Validator.validateStudent(Stud6));
        assertEquals(false, Validator.validateStudent(Stud7));
        assertEquals(false, Validator.validateStudent(Stud8));
    }

}