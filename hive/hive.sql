# You sql follows
select region, ciudad, count(*)
    from escuelaspr
    group by region, ciudad;

 select esc.id, count(*)
    from studentspr est, escuelaspr esc 
    where est.id = esc.id 
    group by esc.id;

select esc.ciudad, esc.id, est.numEstudiante
    from studentsPR est , escuelasPR  esc
    where esc.id= est.id AND (esc.ciudad ="Ponce" OR esc.ciudad="Cabo Rojo");

select esc.region, esc.ciudad, count(*)
    from studentsPR est, escuelasPR esc
    where est.id=esc.id 
    group by esc.region, esc.ciudad;
