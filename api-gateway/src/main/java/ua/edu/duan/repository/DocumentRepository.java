package ua.edu.duan.repository;

import ua.edu.duan.dto.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByUserLogin(String userLogin);
    List<Document> findBySignatureDateNotNull();
    List<Document> findBySignatureDateNull();
    List<Document> findByCreationDateBetween(Date startDate, Date endDate);

}