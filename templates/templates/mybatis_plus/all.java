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


/**Mapper*/

import com.baomidou.mybatisplus.mapper.BaseMapper;

@Repository
public interface ${FMT.XyzAbc($table)}Mapper extends BaseMapper<${FMT.XyzAbc($table)}> {

}


/**Service*/


import com.baomidou.mybatisplus.mapper.BaseMapper;

@Repository
public interface ${FMT.XyzAbc($table)}Service extends IService<${FMT.XyzAbc($table)}> {

}


/**ServiceImpl*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

@Slf4j
@Service
public class ${FMT.XyzAbc($table)}ServiceImpl extends ServiceImpl<${FMT.XyzAbc($table)}>
        implements ${FMT.XyzAbc($table)}Service{

}



