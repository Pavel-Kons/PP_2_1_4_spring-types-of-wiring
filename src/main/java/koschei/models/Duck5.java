package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("duckBean")
public class Duck5 {
    private final Egg6 egg;

    @Autowired
    //Оставил аннотацию, как я понял, если конструктор 1,
    // то он по умолчанию @Autowired
    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
