package za.ac.cput.payroll.Repository;

public interface IRepository<T, Num> {
    T create(T t);
    T update(T t);
    void delete(Num num);
    T read(Num num);
}
