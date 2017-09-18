package am.saGroup.ts.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Suro Smith.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable{

    private static final long serialVersionUID = -3651142618105627116L;

    private String firstName;
    private String lastName;
    private String middleName;
    private String group;
    private Integer age;

}
