package com.volcengine.example.imp.job;

import com.volcengine.service.imp.IImpService;
import com.volcengine.service.imp.impl.ImpServiceImpl;
import com.volcengine.service.imp.model.request.*;
import com.volcengine.service.imp.model.business.*;
import com.volcengine.service.imp.model.response.*;


public class ImpSubmitJobDemo {
    // single job SubmitJob, TranscodeVideo as example
    public static void main(String[] args) throws Exception {

        IImpService impService = ImpServiceImpl.getInstance();
        // call below method if you don't set ak and sk
        impService.setAccessKey("your ak");
        impService.setSecretKey("your sk");

        try {
            InputPath.Builder input = InputPath.newBuilder();
            input.setType("VOD");
            input.setVodSpaceName("your space name");
            input.setFileId("your file id");

            ImpSubmitJobRequest.Builder submitJobRequest = ImpSubmitJobRequest.newBuilder();
            submitJobRequest.setInputPath(input.build());
            submitJobRequest.setCallbackArgs("your call back args");
            submitJobRequest.setEnableLowPriority("false");

            Job.Builder job = Job.newBuilder();
            TranscodeVideoJob.Builder transcodeVideoJob = TranscodeVideoJob.newBuilder();
            Video.Builder video = Video.newBuilder();
            video.setCodec("your video codec");
            video.setBitrate(4000);
            Audio.Builder audio = Audio.newBuilder();
            audio.setCodec("your audio codec");
            audio.setBitrate(128);
            audio.setChannels(2);
            transcodeVideoJob.setContainer("your container");
            transcodeVideoJob.setVideo(video.build());
            transcodeVideoJob.setAudio(audio.build());
            job.setTranscodeVideo(transcodeVideoJob.build());
            submitJobRequest.setJob(job.build());

            ImpSubmitJobResponse resp =  impService.SubmitJob(submitJobRequest.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}