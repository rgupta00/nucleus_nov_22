package com.day11.session1;

import java.util.Comparator;
import java.util.PriorityQueue;

class Job implements Comparable<Job>{
    private int ratePerhr;
    private int hr;
    private String jobName;

    public int getRatePerhr() {
        return ratePerhr;
    }

    public int getHr() {
        return hr;
    }

    public String getJobName() {
        return jobName;
    }

    public Job(int ratePerhr, int hr, String jobName) {
        this.ratePerhr = ratePerhr;
        this.hr = hr;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Job{");
        sb.append("ratePerhr=").append(ratePerhr);
        sb.append(", hr=").append(hr);
        sb.append(", jobName='").append(jobName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Job o) {
        //

        return Integer.compare(o.getHr()*o.getRatePerhr(),this.getHr()*this.getRatePerhr());
    }
}

public class H_PQEx {
    public static void main(String[] args) {
        PriorityQueue<Job> pq=new PriorityQueue<>();
         pq.offer(new Job(1200,45,"make a rim no123"));
        pq.offer(new Job(1900,12,"decoration for bike"));
        pq.offer(new Job(18800,4,"make a engine"));

        System.out.println(pq.poll());
    }
}
