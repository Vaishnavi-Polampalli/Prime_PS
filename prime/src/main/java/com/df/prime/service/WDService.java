package com.df.prime.service;

import com.df.prime.model.WDModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WDService {

    List<WDModel> machines= new ArrayList<>(Arrays.asList(new WDModel(1,false),
            new WDModel(2, false),
            new WDModel(3, false),
            new WDModel(4, false),
            new WDModel(5, false),
            new WDModel(6, false),
            new WDModel(7, false),
            new WDModel(8, false),
            new WDModel(9, false),
            new WDModel(10, false)
            ));

    public String select(int id){
        WDModel w1= get(id+1);
        WDModel w=get(id);
        if(w.isAvailability()==true){
            return "Can't book, washer and dryer are not available";
        } else if (w1.isAvailability()==true) {
            return "Can't book, washer and dryer are not available";
        } else{
            w.setAvailability(true);
            w1.setAvailability(true);
        }

        return "Booked!";
    }

    public List<Integer> getAll(){
        List<Integer> w=new ArrayList<>();
        for(WDModel wd:machines){
            if(wd.isAvailability()==false){
                w.add(wd.getTime());
            }
        }
        return w;
    }

    public WDModel get(int id){
        for(WDModel w:machines){
            if(w.getTime()==id){
                return w;
            }
        }
        return new WDModel(0,false);
    }

    public String getAvailability(int id){
        for(WDModel w:machines){
            if(w.getTime()==id){
                if(w.isAvailability()==true)
                return "Not available";
            }
        }
        return "Available";
    }

}

