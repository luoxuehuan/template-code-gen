
import lombok.Data;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

@Data
@TableName("$table")
public class ${FMT.XyzAbc($table)} implements Serializable {

    #foreach($item in $values)
    /**${item.comment}**/
    private ${item.type} ${FMT.xyzAbc(${item.name})};
    #end
}

