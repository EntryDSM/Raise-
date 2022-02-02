package kr.hs.entrydsm.raisepercent.domain.document.domain.repositories;

import java.util.UUID;
import kr.hs.entrydsm.raisepercent.domain.document.domain.LocalDocument;
import kr.hs.entrydsm.raisepercent.global.entity.DocumentContentId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalDocumentRepository extends CrudRepository<LocalDocument, DocumentContentId> {
	@Query("delete from LocalDocument l where l.id.document.id = :id")
	void deleteByDocumentIdByQuery(@Param("id") UUID uuid);
}
