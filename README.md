CSCI 460: Operating Systems — Assignment 1
</br>
This assignment is on processor management. Write a program that will simulate a
multi-core non-preemptive process scheduler. The setup is as follows:</br>
</br>
<b>(a).</b> Take the last 4 digits of your numeric student number, std no, modulo 3. You
need to emulate a multi-core with k = std_no%3 + 2 processors. For instance, the last
4 digits of your student number is 3456, then you need to emulate a computer with
k = 3456%3 + 2 = 2 processors. You can number the processors as 0,1,...,k − 1.</br>
</br>
<b>(b).</b> Write a round-robin procedure to run the job sequence in an on-line fashion, i.e.,
once a job i arrives you need to, according to the order it arrives, put it on processor
(j + 1)%k and run it immediately. Here j is the processor where job i − 1 was run, and
initially j = 0, i.e., the first job is run on processor 0. You can assume that it takes 1ms
to put each job at any processor to run. When the job sequence is finished, measure the
overall turnaround time, i.e., the time duration between the arrival of the first job and
finish of the last job.</br>
<b>(b.1)</b> Test your program on randomly generated job sequences of 1000 which arrives every
1ms, each job has the processing time between 1ms and 500ms. Run your program at least
100 times to get the statistics, i.e., minimum, maximum, average, and standard deviation.</br>
</br>
<b>(c).</b> Design and code a method which can beat the round-robin method, at least for
the test data with 12 jobs (by showing the corresponding turnaround time for the new
method). Also, test your program on the sequences of 1000 random jobs, again at least
100 times, then print out the minimum, maximum, average, and standard deviation of
the turnaround time.</br>
</br>
<b>Date Due: 11:30pm on Monday, October 3, 2016 (on or before 11:30pm, Oct
3, 2016).</b> Load your source code and output as two separate files on D2L in the folder <b>Assignment
1</b>, preferably in the form of <b>family name − 1.java</b> and <b>family name − 1.output</b>
(assuming that you are using Java). While discussion is allowed, you MUST finish the
assignment by yourself and it does not matter which language you choose to use — of
course, it does not hurt to put some comments in the source code on how to run it.
