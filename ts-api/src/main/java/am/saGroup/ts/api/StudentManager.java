package am.saGroup.ts.api;

import am.saGroup.ts.common.domain.Student;

import java.util.List;

/**
 * @author Suro Smith.
 */
public interface StudentManager {

    List<Student> findAll();

}
