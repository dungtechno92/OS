# Race condition.
# The Critical-Section Problem. 3 điều kiện:
## Mutual exclusion
### Khi 1 process thực thi critial section, không process nào được thực thi critial
  section đó.
## Progress
### Nếu không có tiến trình Pi nào thực hiện CSi và có m tiến trình Pj1, Pj2, ..., Pjm muốn thực hiện CSj1, CSj2, ..., CSjm thì chỉ có các tiến trình không thực hiện REMAINjk (k=1,...,m) mới được xem xét thực hiện CSjk.
## Bounded waiting
### khi yêu cầu đó được chấp nhận, số lần các tiến trình Pj (với j≠i) được phép thực hiện CSj phải bị giới hạn.
### Two general approaches are used to handle critical sections in operating systems: preemptive kernels and nonpreemptive kernels
  
  
# Reference:
### http://coltech.vnu.edu.vn/httt/components/com_joomlaboard/uploaded/files/nlhdh_tuan4.pdf
