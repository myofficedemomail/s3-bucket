package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.FileStoringEntity;

public interface FileRepo extends JpaRepository<FileStoringEntity, Integer> {

}
