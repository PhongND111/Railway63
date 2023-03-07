SELECT * FROM productmanagement.product;

DELETE FROM productmanagement.product WHERE ProductID = 1;

SELECT product.ProductID, product.ProductName, product.ProductPrice, product.ProductDetail, product.RatingStar, manufacturer.ManufacturerName FROM productmanagement.product INNER JOIN manufacturer ON product.ManufacturerId = manufacturer.ManufacturerId ORDER BY product.ProductID ASC;