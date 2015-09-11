void setup() {
  size(420, 360);
}

void draw() {
  if (mousePressed) {
    fill(#2E0854);
  } else {
    fill(#00FFFF);
   
  }
  ellipse(mouseX, mouseY, 80, 80);
  
}