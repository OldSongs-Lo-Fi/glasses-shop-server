package ua.shop.glasses.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.shop.glasses.models.Glass;

public interface GlassRepository extends JpaRepository<Glass, Long> {
    public Glass findGlassById(Long id);
}
