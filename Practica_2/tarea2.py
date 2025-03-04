import matplotlib.pyplot as plt
import matplotlib.patches as patches

def dibujar_figuras():
    fig, ax = plt.subplots(figsize=(7, 7))
    ax.set_xlim(0, 700)
    ax.set_ylim(0, 700)
    ax.set_xticks([])
    ax.set_yticks([])
    ax.set_frame_on(False)
    
    # Dibuja una línea
    ax.plot([100, 200], [600, 500], color='black', linewidth=2)
    
    # Dibuja un rectángulo (descomenta si lo necesitas)
    # rect = patches.Rectangle((300, 500), 100, 100, linewidth=2, edgecolor='black', facecolor='none')
    # ax.add_patch(rect)
    
    # Dibuja una elipse (óvalo)
    oval = patches.Ellipse((450, 550), 100, 100, linewidth=2, edgecolor='black', facecolor='none')
    ax.add_patch(oval)
    
    plt.show()

dibujar_figuras()
