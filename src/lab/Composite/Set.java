package lab.Composite;

import java.util.ArrayList;
import java.util.List;

public class Set implements Market{
        private List<Market> components = new ArrayList<>();

        public void addComponent(Market component){
            components.add(component);
        }

        public void removeComponent(Market component){
        components.remove(component);
    }

        public void present(){
            for (Market component: components){
                component.present();
            }

    }
}
