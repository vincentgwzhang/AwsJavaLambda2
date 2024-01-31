package personal.aws.dynamodb.lambda2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subsriber {

    private Integer id;

    private String email;
}
