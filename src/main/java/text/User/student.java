package text.User;

import lombok.*;

/*
 *@autho  zhengruilong
 *@date 2019-08-31
 */
@AllArgsConstructor
@ToString(of={"p_name","p_age","p_tel","p_address","p_class"})
public class student {


    @Setter
    @Getter
    @NonNull
    private int p_id;
    @Setter@Getter
    @NonNull
    private String p_name;
    @Setter@Getter
    private int p_age;
    @Setter@Getter
    private float tel;
    @Setter@Getter
    private String p_address;
    @Setter@Getter  @NonNull
    private String p_class;


}
