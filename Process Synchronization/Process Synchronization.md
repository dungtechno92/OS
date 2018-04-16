## Race condition.

## The Critical-Section Problem. 3 điều kiện:
#### Mutual exclusion: Khi 1 process thực thi critial section, không process nào được thực thi critial section đó.
#### Progress: Nếu critial section còn khả năng phục vụ và tồn tại process muốn vào đoạn găng, thì process đó phải được thực thi critial section.
#### Bounded waiting: Nếu critial section hết khả năng phục vụ mà vẫn còn process muốn thực hiện nó thì process đó phải xếp vào hàng đợi và thời gian đợi là hữu hạn.
#### Two general approaches are used to handle critical sections in operating systems preemptive kernels and nonpreemptive kernels.

## Peterson’s Solution

## Hardware instructions:
#### TSL(test and set): Trả về giá trị cũ và modify giá trị của ô nhớ đó.
##### Không đảm bảo được chờ đợi hữu hạn => cần phải khắc phục.
##### Luôn phải kiểm tra critical section đã được giải phóng hay chưa.
#### CAS(compare and swap): Giữa giá trị cũ của ô nhớ. Nếu giá trị cũ của ô nhớ bằng giá trị hiện tại của ô nhớ thì thay đổi giá trị của ô nhớ và trả về giá trị mới
##### Không đảm bảo được chờ đợi hữu hạn.
##### Luôn phải kiểm tra critical section đã được giải phóng hay chưa.

## Operating-systems designers: 
#### Mutex locks - spinlock: Advantages: Dễ implement, đảm bảo synchronization. Disavantages: Chỉ 1 process được thực thi critical section tại 1 thời điểm, kiểm tra lock thường phải thực hiện vòng loop dẫn đến lãng phí CPU.
#### Semaphores: Advantages: Nhiều process có thể thực thi critical section tại 1 thời điểm, nếu cpu không support mutex lock có thể dùng semaphore để thay thế. Disadvantages: Nếu wait queue được sử dụng, có thể dẫn đến deadlock và starvation. Nếu wait queue không được sử dụng, lãng phí CPU
#### Priority inversion

## Classic Problems of Synchronization
#### Producer - Comsumer
#### The Readers–Writers Problem
#### The Dining-Philosophers Problem

## Monitor
#### Monitor Usage
#### Dining-Philosophers Solution Using Monitors
#### Implementing a Monitor Using Semaphores
#### Resuming Processes within a Monitor
  
# Reference:
#### http://coltech.vnu.edu.vn/httt/components/com_joomlaboard/uploaded/files/nlhdh_tuan4.pdf
#### https://en.wikipedia.org/wiki/Compare-and-swap
#### https://www.geeksforgeeks.org/priority-inversion-what-the-heck/
