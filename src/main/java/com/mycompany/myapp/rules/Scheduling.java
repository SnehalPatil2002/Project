package com.mycompany.myapp.rules;


import java.text.SimpleDateFormat;

import com.mycompany.myapp.domain.Projects;
import com.mycompany.myapp.repository.ProjectsRepository;
import com.mycompany.myapp.service.ProductConsumptionService;
import com.mycompany.myapp.service.ProjectsService;
import com.mycompany.myapp.service.RawMaterialConsumptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Component
public class Scheduling {
    private static final Logger log = (Logger) LoggerFactory.getLogger(Scheduling.class);

    private ProjectsRepository projectsRepository;
   private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy");

//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
//    }
    @Autowired
    private RawMaterialConsumptionService rawMaterialConsumptionService;

    @Autowired
    private ProductConsumptionService productConsumptionService;

    @Autowired
    private ProjectsService projectsService;
//    @Scheduled(cron = "${cron.job1.cronExpression}")
//    public void saveReportsDay(){
//        log.info("Total Cost for Date " + dateFormat.format(new Date()) + " is ", Integer.toString(rawMaterialConsumptionService.findCostByDate().get(0)));
//    }

    @Transactional
    @Scheduled(cron = "${cron.job1.cronExpression}")
    public void saveReportsDay(){
//        log.info("Total Cost for Date " + dateFormat.format(new Date()) + " is ", Integer.toString(rawMaterialConsumptionService.findCostByDate().get(0)));
        try{
            int cost =  rawMaterialConsumptionService.getTotalRawMaterialCost(1)+productConsumptionService.getTotalProductsCost(1);
            log.info("Total Cost of overall project " + cost );
            Projects projects = projectsService.updateFinalTotal((double)cost);
            log.info("Data saved" + projects.getFinalTotal());

//            Projects projects = projectsRepository.findById((long)1).orElse(null);
//            log.info("got project");
//            if(projects!=null){
//                projects.setFinalTotal((double) cost);
//                log.info("set value");
//                Projects projects2 = projectsRepository.save(projects);
//                log.info("Data saved" + projects2.getFinalTotal());
//            }
//            else{
//                log.info("null project");
//            }

        }
        catch(Exception e){
            log.info("Errorrrrrr");
        }
        //log.info("rawMaterial Cost is " + rawMaterialConsumptionService.getTotalRawMaterialCost(1));
         //log.info("products Cost is " + productConsumptionService.getTotalProductsCost(1));
    }
}
