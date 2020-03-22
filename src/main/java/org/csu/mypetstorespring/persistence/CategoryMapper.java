package org.csu.mypetstorespring.persistence;

import org.csu.mypetstorespring.domain.Category;
import org.springframework.stereotype.Repository;

@Repository //指明是数据库
public interface CategoryMapper {
    Category getCategory(String categoryId);
}
