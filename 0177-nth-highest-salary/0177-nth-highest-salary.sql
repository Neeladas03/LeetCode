CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare offsetval int;
  set offsetval=N-1;
  RETURN (
      select distinct salary from Employee
      order by salary desc limit 1 offset offsetval
  );
END