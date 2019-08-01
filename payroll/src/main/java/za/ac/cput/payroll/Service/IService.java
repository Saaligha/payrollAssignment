package za.ac.cput.payroll.Service;

public interface IService <T, Num> {
    T create(T type);

    T update(T type);

    void delete(Num num);

    T read(Num num);
}

