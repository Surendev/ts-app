package am.saGroup.ts.impl.facade;

import am.saGroup.ts.api.StudentManager;
import am.saGroup.ts.common.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suro Smith.
 */
public class StudentManagerFacade implements StudentManager {

    public List<Student> findAll() {
        return new ArrayList<>();
    }
}
