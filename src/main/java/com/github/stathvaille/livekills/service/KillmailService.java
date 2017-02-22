package com.github.stathvaille.livekills.service;

import com.github.stathvaille.livekills.domain.KillWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;

@Service
public class KillmailService {

    private static final Logger logger = LoggerFactory.getLogger(KillmailService.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 1)
    public void reportCurrentTime() {
        RestTemplate restTemplate = new RestTemplate();
        KillWrapper killWrapper = restTemplate.getForObject("https://redisq.zkillboard.com/listen.php?queueID=stathvaille", KillWrapper.class);

        //Map killWrapper = restTemplate.getForObject("https://redisq.zkillboard.com/listen.php?queueID=stathvaille", Map.class);

        try{
            logger.info(killWrapper.getKill().toString());
        }
        catch (NullPointerException e){
            logger.error("no kill");
        }


//            if (kill.getKillID() == null){
//                logger.info("No killmails for you");
//            }
//            else {
//                logger.info("The time is now {}", dateFormat.format(new Date()));
//                //logger.info(killWrapper.getAttackerCount_str() + " people killed " + killWrapper.getCharacter().getName());
//            }
    }
}
