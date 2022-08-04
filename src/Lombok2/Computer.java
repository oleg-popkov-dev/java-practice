package Lombok2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Computer implements IComputer {
    private String name;

    @NonNull
    private IMonitor monitor;

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + getMonitor().getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + getMonitor().getName());
    }
}